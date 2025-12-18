from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/dynamic-controls")
    ## # Print the title of the page
    print("Title of the page: ", driver.title)
    
    ### Find the checkbox
    checkbox = driver.find_element(By.ID, "checkbox")
    ## Find the checkbox toggle button
    toggle_checkbox = driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']")
    
    ### Verify if the checkbox is displayed or not
    print("Checkbox is displayed: ", checkbox.is_displayed())

    ##Click the checkbox_toggle button to hide checkbox
    toggle_checkbox.click()
    ##Verify again if the checkbox is displayed or not
    print("Checkbox is visible: ", checkbox.is_displayed())
    
    ##Close the browser
    driver.quit()


