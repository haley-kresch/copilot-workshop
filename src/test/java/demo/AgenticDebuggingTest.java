package demo;

import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AgenticDebuggingTest {

  @Test
  void testSummarize_includesRefunds() {
    List<AgenticDebugging.Transaction> txs = List.of(
        new AgenticDebugging.Transaction("alice", 100.0),
        new AgenticDebugging.Transaction("alice", -20.0),
        new AgenticDebugging.Transaction("alice", 10.0)
    );
    AgenticDebugging transactionSummarizer = new AgenticDebugging();
    Map<String, Double> result = transactionSummarizer.summarize(txs);
    // Expect: 100 + (-20) + 10 = 90
    assertEquals(90.0, result.get("alice"), 0.0001);
  }
}
