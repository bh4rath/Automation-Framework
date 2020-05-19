package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By edit = By.xpath("//h5[(text()='Edit')]");
    private By button = By.xpath("//h5[(text()='Button')]");
    private By hyperlink = By.xpath("//h5[(text()='HyperLink')]");
    private By image = By.xpath("//h5[(text()='Image')]");
    private By dropdown = By.xpath("//h5[(text()='Drop down')]");
    private By alert = By.xpath("//h5[(text()='Alert')]");
    private By frame = By.xpath("//h5[(text()='Frame')]");
    private By window = By.xpath("//h5[(text()='Window')]");
    private By radioButton = By.xpath("//h5[(text()='Radio Button')]");
    private By checkBox = By.xpath("//h5[(text()='Checkbox')]");
    private By draggable = By.xpath("//h5[(text()='Draggable')]");
    private By droppable = By.xpath("//h5[(text()='Droppable')]");
    private By selectable = By.xpath("//h5[(text()='Selectable')]");
    private By sortable = By.xpath("//h5[(text()='Sortable')]");
    private By appear = By.xpath("//h5[(text()='Wait to Appear')]");
    private By disappear = By.xpath("//h5[(text()='Wait to Disappear')]");

    public EditPage clickEditComponent() {
        driver.findElement(edit).click();
        return new EditPage(driver);
    }

    public ButtonPage clickButtonComponent() {
        driver.findElement(button).click();
        return new ButtonPage(driver);
    }

    public HyperLinkPage clickHyperlinkComponent() {
        driver.findElement(hyperlink).click();
        return new HyperLinkPage(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public ImagePage ClickOnTheImage() {
        driver.findElement(image).click();
        return new ImagePage(driver);
    }

    public DropdowPage ClickOnDropdown() {
        driver.findElement(dropdown).click();
        return new DropdowPage(driver);
    }

    public AlertPage ClickOnAlert() {
        driver.findElement(alert).click();
        return new AlertPage(driver);
    }

    public FramePage ClickOnFrames() {
        driver.findElement(frame).click();
        return new FramePage(driver);
    }

    public WindowPage clickWindow() {
        driver.findElement(window).click();
        return new WindowPage(driver);
    }

    public RadioPage clickRadio() {
        driver.findElement(radioButton).click();
        return new RadioPage(driver);
    }

    public CheckboxPage clickCheckbox() {
        driver.findElement(checkBox).click();
        return new CheckboxPage(driver);
    }

    public DraggablePage draggable() {
        driver.findElement(draggable).click();
        return new DraggablePage(driver);
    }

    public DroppablePage droppable() {
        driver.findElement(droppable).click();
        return new DroppablePage(driver);
    }

    public SelectablePage clickSelect() {
        driver.findElement(selectable).click();
        return new SelectablePage(driver);
    }

    public SortablePage clickSortable() {
        driver.findElement(sortable).click();
        return new SortablePage(driver);
    }

    public ElementAppearPage clickWaittoAppear() {
        driver.findElement(appear).click();
        return new ElementAppearPage(driver);
    }

    public ElementDisappearPage clickWaittoDisappear() {
        driver.findElement(disappear).click();
        return new ElementDisappearPage(driver);
    }
}