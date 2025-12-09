import pytest

def test_sum():
    num1 = 5
    num2 = 7
    assert (num1 + num2) == 12

def test_diff():
    num1 = 5
    num2 = 7
    assert (num1 - num2) == -2

@pytest.mark.activity
def test_prod():
    num1 = 5
    num2 = 7
    prod = (num1 * num2)
    assert prod == 35

@pytest.mark.activity
def test_div():
    num1 = 10
    num2 = 5
    quot = (num1 / num2)
    assert  quot == 2