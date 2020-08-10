grammar Raag;

// parser rules:
syntax : declarations (unit)*;


declarations: 'beatsPerCycle:' beatsPerCycle ';'
              'numCycles:' numCycles ';'
              'Range:' low '-' high ';'
              (optionalDeclarations)?;

optionalDeclarations: 'OutFile:' outFileName ';'
                    | 'Start:' start ';'
                    | 'base:' baseFreq ';'
                    | 'msec:' msec ';'
                    | 'volume:' volume ';'
                    | 'playFile:' playFileName ';'
                    | 'wavFile:' wavFileName ';';

outFileName: VARNAME;
start: VARNAME;
baseFreq: FLOAT;
beatsPerCycle: (DIGIT)+;
numCycles: (DIGIT)+;
low: VARNAME;
high: VARNAME;
msec: (DIGIT)+;
volume: FLOAT;
playFileName: VARNAME;
wavFileName: VARNAME;

unit : rule | schemeBlock;


// 1. 'rule' rules:
rule : variable '->' derivation ';';
derivation : expression ('|' expression)*;
expression : combinator ',' probability
           | sequence ',' probability;

combinator : '(' option ('-' option)* ',' DIGIT ')';
sequence : option ('-' option)*; //like: Sa-Re-ma-ma or SaFirst-gaFirst-ni or

option : VARNAME
       | swar
       | schemeCall;

schemeCall : schemeNameCalled '(' swar ')';
schemeNameCalled : VARNAME;
variable : VARNAME;
probability : FLOAT;


// 2. 'scheme' rules:
schemeBlock : 'palta' '{' octave schemes '}';

octave : 'sargam' '{' octaveOption '}';
octaveOption : ascent
             | ascent descent;
ascent : 'arohan' ':' arohan ';';
descent : 'avarohan' ':' avarohan ';';
arohan : swar (',' swar)+;
avarohan : swar (',' swar)+;

schemes : (scheme ';')+;
scheme : schemeName '->' schemeDerivation;
schemeName : VARNAME;
schemeDerivation : schemeExpression ('|' schemeExpression)*;
schemeExpression : schemeOption ',' schemeProbability;
schemeProbability : FLOAT;
schemeOption : combinatorScheme
             | simpleScheme;
combinatorScheme : '(' DIGIT+ ',' DIGIT ')';
simpleScheme : DIGIT+;

swar : ('Sa' | 'Re' | 're' | 'Ga' | 'ga' | 'Ma' | 'ma' | 'Pa' | 'Dha' | 'dha' | 'Ni' | 'ni')('*' | '_')?;





// lexer rules:
VARNAME : [a-zA-Z][a-zA-Z0-9_*]*;
FLOAT : [0-9]* '.' [0-9]+;

DIGIT : [0-9];

IGNORE : [ \t\n] -> skip;