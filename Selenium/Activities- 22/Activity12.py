from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Firefox() as driver:
    wait = WebDriverWait(driver, timeout=30)
    driver.get("https://training-support.net/webelements/dynamic-content")
    print("Title of the page is: ", driver.title)

    driver.find_element(By.ID, "genButton").click()

    if wait.until(expected_conditions.text_to_be_present_in_element((By.ID, "word"), "release")):
        print("Word found: ", driver.find_element(By.ID, "word").text)