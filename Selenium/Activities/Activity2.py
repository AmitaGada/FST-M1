from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/login-form/")

    print("Title of the page: ", driver.title)

    element = driver.find_element(By.ID, "username").send_keys("admin")

    element = driver.find_element(By.ID, "password").send_keys("password")

    element = driver.find_element(By.CLASS_NAME, "svelte-1pdjkmx").click()

    print("Title of the new page: ", driver.title)
