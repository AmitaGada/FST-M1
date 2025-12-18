from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains


with webdriver.Firefox() as driver:
    actions = ActionChains(driver)
    driver.get("https://training-support.net/webelements/drag-drop")

    print("Title of the page: ", driver.title)

    ##Findelements
    FootBall = driver.find_element(By.ID, "ball")
    DropZone1 = driver.find_element(By.ID, "dropzone1")
    DropZone2 = driver.find_element(By.ID, "dropzone2")

    actions.click_and_hold(FootBall).move_to_element(DropZone1).pause(5).release().perform()
    if((DropZone1.find_element(By.CLASS_NAME, "dropzone-text")).text == "Dropped!"):
        print("Ball was dropped in dropzone 1")

    actions.drag_and_drop(FootBall, DropZone2).pause(5).perform()
    if((DropZone2.find_element(By.CLASS_NAME, "dropzone-text")).text == "Dropped!"):
        print("Ball was dropped in dropzone 2")
    
    driver.quit()

