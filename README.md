# tdd-scoreboard
## Example project for TDD: ScoreBoard for Tennis
This project provides the basic structure for developing a simple score board for tennis. 

### Problem description:
Develop a score board for tennis that provides the tennis-specific scores based on the points each player has gained.   
The scoring system works according to the following rules:
- The first player who has at least four points in total and at least two points more than the opponent wins
- The scores from zero to three points are described as **Love**, **Fifteen**, **Thirty**, and **Forty**
- **Deuce**: Each player has at least three points, and the scores are equal
- **Advantage**: Each player has at least three points and one player has one more point than the opponent  

(For a detailed description see [SammanCoaching.org](https://sammancoaching.org/kata_descriptions/tennis.html))

### Project structure:
There are two Java source files provided:  
`ScoreBoardTest.java`
: test class implementing the test cases  
`ScoreBoard.java`
: represents the Score Board for converting points to tennis scores 

### Current state of the project:
The following test cases are already implemented:
| Points player1 | Points player2 | Score |
| ----------- | ----------- | ----------- |
| 0 | 0 | Love-all |
| 1 | 1 | Fifteen-all |
| 2 | 2 | Thirty-all |

### How to continue:
Apply the Test-Code-Refactor cycle and implement the above mentioned rules for tennis scoring - step by step.  

Happy coding!
