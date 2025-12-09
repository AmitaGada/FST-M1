import pytest

def test_sum():
    num1 = 5
    num2 = 7
    assert (num1 + num2) == 12

def test_diff():
    num1 = 5
    num2 = 7
    assert (num1 - num2) == -2

def test_prod():
    num1 = 5
    num2 = 7
    assert (num1 * num2) == 35
    
def test_div():
    num1 = 10
    num2 = 5
    assert (num1 / num2) == 2