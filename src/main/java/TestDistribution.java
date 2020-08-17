import com.soundcheck.processor.Distribution;

import java.util.HashMap;
import java.util.Map;

class Container  {
    Distribution<String> dist = new Distribution<>();
    Map<String, Integer> map = new HashMap<>();
    int n;

    public void add(String key, double proba) {
        dist.add(key, proba);
        map.put(key, 0);
    }

    @Override
    public String toString() {
        String res = "";

        for(String key: dist.getValues()) {
            res += key + ": [" + dist.get(key) + "   " + (double)map.get(key) / (double)n + "]\n";
        }

        return res;
    }
}

public class TestDistribution {
    public static void main(String[] args) {
        Container container = new Container();

        container.add("1", 0.05);
        container.add("2", 0.15);
        container.add("3", 0.13);
        container.add("4", 0.07);
        container.add("5", 0.30);
        container.add("6", 0.10);
        container.add("7", 0.15);
        container.add("8", 0.04);
        container.add("9", 0.07);
        container.add("1", 0.04);

        int n = 10000;
        container.n = n;

        for(int i = 0; i < n; i++) {
            Distribution<String> dist = container.dist;
            String choice = dist.sample();
            container.map.put(choice, container.map.get(choice) + 1);
        }

        System.out.println(container);
    }
}
