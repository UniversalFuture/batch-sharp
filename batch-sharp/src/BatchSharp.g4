grammar BatchSharp;

import BatchSharpPreProcessor;

application: (codeline NEWLINE+)* codeline;
codeline: (directive)+;
c: codeline NEWLINE;
