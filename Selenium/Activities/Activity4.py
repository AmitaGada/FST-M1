from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Firefox() as driver:
    Actions = webdriver.ActionChains(driver)
    
    driver.get("https://training-support.net/webelements/mouse-events")
    ##Get the title of the page and print it to the console
    print("Title of the page: ", driver.title)

    ##Find the elements
    cargolock = driver.find_element(By.XPATH, "//h1[text()='Cargo.lock']")
    cargotoml = driver.find_element(By.XPATH, "//h1[text()='Cargo.toml']")
    src = driver.find_element(By.XPATH, "//h1[text()='src']")
    target = driver.find_element(By.XPATH, "//h1[text()='target']")

    ##Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it
    Actions.click(cargolock).pause(1).move_to_element(cargotoml).pause(5).click(cargotoml).perform()
    
    ##Print the confirmation text
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)
    
    ##Double click on the src button. Then right click on the target button and select open
    Actions.double_click(src).pause(2).move_to_element(target).pause(5).context_click(target).perform()
    Actions.click(driver.find_element(By.XPATH, ("//div[@id='menu']/div/ul/li[1]"))).pause(5).perform()
    
    ##Print the confirmation text
    actionMessage=driver.find_element(By.ID, "result").text
    print(actionMessage)
    
    ##Close the browser
    driver.quit()