from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    wait = WebDriverWait(driver, timeout=30)
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print("Title of the page: ", driver.title)

    checkbox = driver.find_element(By.ID, "checkbox")
    print("is checkbox visisble: ", checkbox.is_displayed())

    driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']").click()
    wait.until(EC.invisibility_of_element(checkbox))
    print("is checkbox visisble: ", checkbox.is_displayed())

    driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']").click()
    wait.until(EC.element_to_be_clickable(checkbox)).click()
    print("is checkbox selected: ", checkbox.is_selected())

    driver.quit()




