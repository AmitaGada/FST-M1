from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/target-practice")
    print("Title of the page: ", driver.title)
    
    ##3rd header on the page and print it's text to the console.
    header3_message = driver.find_element(By.XPATH, "//h3[contains(text(), '#3')]").text
    print("message on header3: ", header3_message)

    ##5th header on the page and print it's color.
    element = Color.from_string(driver.find_element(By.XPATH, "//h5[contains(text(), '#5')]").value_of_css_property("color"))
    ##rgb_color = Color.from_string(element).value_of_CSS_property('color')
    print("RGB color: ", element)
    print("heading5 colour as Hexcode: ", element.hex)
    ##hex_color = Color.from_string(element).hex
    ##print("hex color is: ", hex_color)

    ##purple button and print all it's classes.
    Att_value = driver.find_element(By.XPATH, "//button[contains(text(), 'Pu')]").get_attribute("Class")
    print("Purple button Class attribute: ", Att_value)

    ##slate button and print it's text.
    button_text = driver.find_element(By.XPATH, "//button[contains(text(), 'Sl')]").text
    print("text on Slate button: ", button_text)

    driver.quit()