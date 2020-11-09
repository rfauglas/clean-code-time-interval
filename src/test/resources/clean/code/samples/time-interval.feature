# TimeInterval is a  "closed opened" interval: [ <start_date>, <end_date> [
Feature: interval intersection detection

  Background:
    Given a reference interval starting in 11/01/2020 ending in 12/01/2020

  Scenario Outline: test interval ended  before interval reference
    Given test interval starting in <start_date> ending <end_date>
    Then saying 'interval intersection is empty' is <expected_result>

    Examples:
    | start_date  |end_date   | expected_result  |
    | 09/01/2020  |10/01/2020 | false            |
