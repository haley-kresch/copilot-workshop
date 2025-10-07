package demo;


import java.util.*;

/**
 * AgenticDebugging
 *
 * Focus: AGENTIC DEBUGGING with GitHub Copilot in IntelliJ.
 * Use Agent Mode
 */
public class AgenticDebugging {
//  Transaction Summarizer

  public static class Transaction {
    public final String user;
    public final double amount;
    public Transaction(String user, double amount) {
      this.user = user;
      this.amount = amount;
    }
  }

  /**
   * Sums transactions by user, but mistakenly drops negative transactions.
   */
  public Map<String, Double> summarize(List<Transaction> txs) {
    Map<String, Double> sums = new HashMap<>();
    for (Transaction t : txs) {
      if (t.amount < 0) {
        continue;  // bug: skipping negative refunds entirely
      }
      sums.put(t.user, sums.getOrDefault(t.user, 0.0) + t.amount);
    }
    return sums;
  }

  public static void main(String[] args) {
    List<Transaction> txs = List.of(
        new Transaction("alice", 100.0),
        new Transaction("bob",  50.0),
        new Transaction("alice", -20.0),   // refund
        new Transaction("bob",   30.0),
        new Transaction("alice", 10.0)
    );
    AgenticDebugging transactionSummarizer = new AgenticDebugging();
    Map<String, Double> result = transactionSummarizer.summarize(txs);
    result.forEach((user, sum) ->
        System.out.printf("User %s → total = %.2f%n", user, sum));
  }
}
