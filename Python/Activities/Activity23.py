import pytest

@pytest.fixture
def input_list():
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return list

def test_listsum(input_list):
    sum = 0
    for n in input_list:
        sum += n
    assert sum == 55
