# ChirpWow Toturials \ Example 17

## Overview
This example will demonstrate how to define a plug-in based product
configuration for an RCP application and run a minimal RCP application product
using PDE. Next, this example will demonstrate how to add window images,
add a splash screen and customize a launcher for an RCP application.
Finally, This example will demonstrate how to modify a build configuration and
export an RCP product using PDE.

## Requirements
* **Eclipse IDE for Eclipse Committers** [link](https://www.eclipse.org/downloads/)
* **OpenJDK 17** [link](https://adoptium.net/)

## Guidelines
* To open the plug-in development perspective, select **Window->Open Perspective->Other...** and choose **Plug-in Development**.
* Select **File->New->Project...** from the main menu, expand the **Plug-in Development** category within the resulting **New Project** dialog box, and choose **Plug-in Project**.
* Input **com.chirpwow.ide** into the **Project Name** text box on the **Plug-in Project** page and click **Next >**.
* Input **IDE** into the **Name** text box. Select the **Yes** radio button under the **Rich Client Application** heading on the **Plug-in Content** page and click **Next >**.
* Select the **RCP 3.x application (minimal)** template from the list of **Available Plug-in Templates** and click **Next >**.
* Input **RCP IDE** into the **Application window title** text box on the **Basic RCP application** page and click **Finish**.
* Select the **com.chirpwow.ide** plug-in editor from the workbench and select the **Overview** tab within it.
* Click the **Launch an Eclipse application** or **Launch an Eclipse application in Debug mode** hyperlink under the **Testing** heading.
* To create a new empty **con.chirpwow.ide.product** project under the parent **example17**. Select **File->New->Other** form the main menu, expand the **General** category within the resulting **Select a wizard** dialog box, and choose **Project**.
* Input **com.chirpwow.ide.product** into the **Project name** text box on the **Project** page, next to uncheck **Use default location** radio box and click **Browse..** button to manually create a new **com.chirpwow.ide.product** folder and click **Finish**.
* To create the product configuration. Select **File->New->Product Configuration** from the main menu.
* Select **example17/com.chirpwow.ide.product** to be the parent folder under the **Enter or select the parent folder** heading in the **New Product Configuration** wizard page.
* Select **ide.product** in the resulting **New Product Configuration** wizard page.
* Select the **Use a launch configuration** radio button inside the **Initialize the file content** group and verify that **com.chirpwow.ide.application** is selected in the combo box. Click **Finish**.
* To open the product editor (if it is not already open), expand the **com.chirpwow.ide.product** tree dialog in the Package Explorer view and double-click on the **ide.product** file (the Overview page should be open initially).
* To define the product, perform this step first. Click the **New...** button below the **Product** heading in the **Overiew** page next to the **Product Definition** page.
* Input **RCP IDE App** into the **Product Name** text box.
* Verify **com.chirpwow.ide** is the value entered for the **Defining Plug-in** text box.
* Input **product** into the **Product ID** text box.
* Verify **com.chirpwow.ide.application** is the value entered for the **Application** text box in the **Product Application** heading.
* Accept the defaults and click **Finish**.
* Select **File->Save** from the main menu.
* To synchronize the product configuration with the defining plug-in, click the **Synchronize** hyperlink under the **Testing** heading on the product editor **Overview** page.
* To run the RCP product, perform that click the **Launch an Eclipse application** hyperlink under the **Testing** heading.
* For product customization purpose, copy and add images into **icons** folder from this git toturial **example17/com.chirpwow.ide/icons** folder, also copy **splash.bmp** into **example17/com.chirpwow.ide** folder.
* Select the **Branding** tab within the product editor to display the **Branding** page.
* Click the **Browse...** button adjacent to these **16x16**, **32x32**, **48x48**, and **256x256** text boxes under the "Window Images" heading.
* Select the **Splash** tab within the product editor to display the **Splash** page.
* Click the **Browse...** button adjacent to the **Plug-in** text box under the **Location** heading.
* Select the **com.chirpwow.ide** entry in the **Plug-in Selection** dialog box and click **Add**. Note: Eclipse expects a file called **splash.bmp** to be located in the root of the specified plug-in. Verify that the root folder of **com.chirpwow.ide** plug-in has the **splash.bmp**.
* In order to control what files are deployed with our packaged RCP application, we need to modify the build configuration. To modify **Build Configureation**, select the **com.chirpwow.ide** plug-in editor from the workbench and select the **Build** tab within it.
* Select the checkbox corresponding to the **icons** directory under the **Binary Build** heading.
* Select the checkbox corresponding to the **splash.bmp** file under the **Binary Build** heading.