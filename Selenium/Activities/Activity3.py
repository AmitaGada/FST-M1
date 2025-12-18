from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/login-form/")

    print("Title of the page: ", driver.title)

    element = driver.find_element(By.XPATH, "//input[@id='username']").send_keys("admin")

    element = driver.find_element(By.XPATH, "//input[@id='password']").send_keys("password")

    element = driver.find_element(By.XPATH, "//button[text()='Submit']").click()

    print("Title of the new page: ", driver.title)

    message = driver.find_element(By.XPATH, "//h1[contains(@class, 'text-center')]")

    print(message.text)

    driver.quit()