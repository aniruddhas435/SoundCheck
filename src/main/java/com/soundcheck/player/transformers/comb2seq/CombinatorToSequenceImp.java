package com.soundcheck.player.transformers.comb2seq;

import com.soundcheck.processor.Distribution;

public class CombinatorToSequenceImp implements CombinatorToSequence {

    private Distribution<Character> notesDist = new Distribution<>();

    public Distribution<Character> getNotesDist() {
        return notesDist;
    }

    public void setNotesDist(Distribution<Character> notesDist) {
        this.notesDist = notesDist;
    }

    @Override
    public String getSimpleSchemeFromCombinator(String notes,
                                                int sampleSize) {
        String result = "";

        double probability = 1.00 / (double)(notes.length());

        for(int i = 0; i < notes.length(); i++) {
            char c = notes.charAt(i);
            notesDist.add(c, probability);
        }

        for(int i = 0; i < sampleSize; i++) {
            char sample = notesDist.sample();
            notesDist.add(sample, notesDist.get(sample) / 5.0);
            result += sample;
        }

        System.out.println(notesDist);

        return result;
    }
}
