from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/dynamic-controls")
    ##Get the title of the page and print it to the console
    print("Title of the page: ", driver.title)

    ##Find the text field
    textfield = driver.find_element(By.ID, "textInput")
    ##Check if the text field is enabled and print it
    print("is text field enable: ", textfield.is_enabled())

    ##Click the "Enable Input" button to enable the input field
    driver.find_element(By.ID, "textInputButton").click()
    ##Check if the text field is enabled again and print it
    print("Is text field enabled: ", textfield.is_enabled())

    ##Close the browser
    driver.quit()