from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net")

    pageTitle = driver.title

    print("Title of the page: ", pageTitle)

    element = driver.find_element(By.LINK_TEXT, "About Us").click()

    print("New page title is : ", driver.title)

    driver.quit()