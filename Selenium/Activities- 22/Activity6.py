from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/dynamic-controls")
    ##Get the title of the page and print it to the console.
    print("Title of the page: ", driver.title)

    ##Find the checkbox input element.
    checkbox = driver.find_element(By.ID, "checkbox")
    ##Check if the checkbox is selected and print the result.
    print("Is checkbox select: ", checkbox.is_selected())

    ##Click the checkbox to select it.
    driver.find_element(By.ID, "checkbox").click()
    ##Check if the checkbox is selected again and print the result
    print("Is checkbox selected: ", checkbox.is_selected())

    ##Close the browser
    driver.quit()
