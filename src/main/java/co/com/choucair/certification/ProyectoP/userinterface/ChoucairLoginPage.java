package co.com.choucair.certification.ProyectoP.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage  extends PageObject{
public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.xpath("//*[@id=\"yui_3_17_2_1_1641795702462_20\"]/strong"));
public static final Target INPUT_USER =Target.the("User").located(By.id("username"));
    public static final Target INPUT_PASSWORD=Target.the("password").located(By.id("password"));
    public static final Target ACCES_BUTTON= Target.the("Acess").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));

}
