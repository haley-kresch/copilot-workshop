
---
//TODO: link slides

## 🚀 How to Run
1. Open the project in **IntelliJ IDEA**.
2. Run `./gradlew build` or use the Gradle tool window to build.
3. Run tests with `./gradlew test`.

---

## 🎯 Demo Tasks

### 1. Few-Shot Prompting (Calculator.java)
- Weak Prompt: *"Write tests for the calculator."*
- Few-Shot Prompt: *"Write unit tests for Calculator using JUnit 5. Follow this style: [give example]."*

### 2. Chain-of-Thought (Factorial.java)
- Prompt: *"Think step by step about what happens when n=0. Find the bug and fix it."*

### 3. Iterative Refinement (UserRepository.java)
- Step 1: *"Suggest a more efficient version of getDuplicates."*
- Step 2: *"Good. Now make it O(n) using a Set."*
- Step 3: *"Now add JavaDoc and type hints."*

### 4. Negative Prompting (DemoApp.java)
- Prompt: *"Write class documentation, but do not include any code examples."*

---

## ✅ What You’ll Learn
- How different prompting strategies affect Copilot’s output.
- Why **Few-Shot**, **Chain-of-Thought**, **Iterative Refinement**, and **Negative Prompting** produce better results than weak prompts.
- Practical examples for **unit testing, debugging, optimization, and documentation**.
