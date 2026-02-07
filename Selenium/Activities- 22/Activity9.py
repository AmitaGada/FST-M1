from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import Keys, ActionChains

with webdriver.Firefox() as driver:
    Actions = webdriver.ActionChains(driver)

    driver.get("https://training-support.net/webelements/keyboard-events")
    print("The title of the page: ", driver.title)

    Actions.send_keys("This is selenium script").send_keys(Keys.RETURN).perform()

    pageText = driver.find_element(By.CSS_SELECTOR, "h1.mt-3").text

    print(pageText)

    

