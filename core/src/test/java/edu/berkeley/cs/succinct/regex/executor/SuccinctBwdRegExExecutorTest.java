package edu.berkeley.cs.succinct.regex.executor;

import edu.berkeley.cs.succinct.regex.RegExMatch;
import edu.berkeley.cs.succinct.regex.parser.RegExParser;
import edu.berkeley.cs.succinct.regex.parser.RegExParsingException;

import java.util.Set;

public class SuccinctBwdRegExExecutorTest extends RegExExecutorTest {

  Set<RegExMatch> runRegEx(String exp, boolean greedy)
    throws RegExParsingException {
    RegExExecutor ex = new SuccinctBwdRegExExecutor(succinctFile, new RegExParser(exp).parse(), greedy);
    ex.execute();
    return ex.getFinalResults();
  }
}
