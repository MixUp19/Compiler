package MVC.Model;

public enum Token {
  RESERVED_WORD, IDENTIFIER, INTEGER,
  STRING, LEFT_PARENTHESES, RIGHT_PARENTHESES,
  LEFT_CURLY_BRACE, RIGHT_CURLY_BRACE, ASSIGNMENT,
  EQUALS, NOT_EQUALS, LESS, LESS_EQUALS, GREATER,
  GREATER_EQUALS, ADD, SUBSTRACT, UNKNOWN
}