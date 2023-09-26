The Button component from react-native-material is a component that can be used to display a button. Buttons are typically used to allow users to take actions, such as submitting a form, navigating to a different screen, or deleting a record.

To use the Button component, simply import it into your component and then add it to your render function. The Button component has a few props that you can use to customize it, such as the title prop, the variant prop, and the color prop.

Here is an example of how to use the Button component:

JavaScript
import React from "react";
import { Button } from "@react-native-material/core";

const App = () => (
  <Button title="Button" />
);

export default App;
Use code with caution. Learn more
This code will render a button with the text "Button".

You can also use the Button component to display a button with an icon. For example, the following code will render a button with a delete icon:

JavaScript
import React from "react";
import { Button, Icon } from "@react-native-material/core";

const App = () => (
  <Button title="Delete" leading={<Icon name="delete" />} />
);

export default App;
Use code with caution. Learn more
The Button component can be used in a variety of ways. It is a good idea to use the Button component whenever you want to allow users to take an action.

Here is a summary of the props that you can use to customize the Button component:

title: The text to display on the button.
variant: The style of the button. Can be text, outlined, or contained.
color: The main color of the button.
tintColor: The color of the contained buttons content (text, icons, etc.).
compact: Smaller horizontal padding, useful for text buttons in a row.
disableElevation: If true, no shadow is used. No effect on outlined and text buttons.
uppercase: If false, the button title is not rendered in upper case. No effect if you pass a React.Node as the title prop.
loading: Whether to show a loading indicator.
loadingIndicatorPosition: The place where the loading indicator should appear. Can be leading, trailing, or overlay.
loadingIndicator: A React.Node to replace the default loading indicator. Also, you can pass a string to show a text (e.g. "Loading...").
pressableContainerStyle: The style of the button's pressable component container.
contentContainerStyle: The style of the button's container.
titleStyle: The style of the button's text. No effect if you pass a React.Node as the title prop.
leadingContainerStyle: The style of the button's leading element container.
trailingContainerStyle: The style of the button's trailing element container.
loadingOverlayContainerStyle: The style of the button's loading indicator overlay view. No effect if loadingIndicatorPosition is not overlay.
Here are some images of the different styles of buttons:
Contained buttonOpens in a new window

m2.material.io
Contained button

Here are some examples of how to use the different props of the Button component:

JavaScript
// Render a button with a custom color
<Button title="Button" color="red" />

// Render a button with an icon
<Button title="Delete" leading={<Icon name="delete" />} />

// Render a button with a loading indicator
<Button title="Button" loading />

// Render a button with a custom loading indicator
<Button title="Button" loadingIndicator="⏰" />

// Render a button with a loading indicator in the overlay position
<Button title="Button" loadingIndicatorPosition="overlay" />
Use code with caution. Learn more
I hope this helps!







-------------------------------------------------------------------------------------------------------------------------------------------------------



  The `Button` component from the `@react-native-material/core` library allows you to create buttons in your React Native applications. Below, I'll explain the key props and how to use them:

1. **title**:
   - Type: string | React.ReactNode | ((props: { color: string }) => React.ReactNode | null)
   - This prop specifies the text content of the button. You can provide a string, a React element, or a function that returns a React element. It's the visible label on the button.

2. **leading** (optional):
   - Type: React.ReactNode | ((props: { color: string; size: number }) => React.ReactNode | null)
   - This prop allows you to place an element before the button's title. It can be a React element or a function returning a React element. This is useful for adding icons or other elements.

3. **trailing** (optional):
   - Type: React.ReactNode | ((props: { color: string; size: number }) => React.ReactNode | null)
   - Similar to `leading`, this prop allows you to place an element after the button's title.

4. **variant** (optional):
   - Type: "text" | "outlined" | "contained"
   - Default: "contained"
   - Specifies the style of the button. You can choose from "text" (low emphasis), "outlined" (medium emphasis), and "contained" (high emphasis).

5. **color** (optional):
   - Type: Color
   - Default: "primary"
   - Specifies the main color of the button. For "contained" buttons, this is the background color. For "outlined" and "text" buttons, this is the color of the content (text, icons, etc.).

6. **tintColor** (optional):
   - Type: Color
   - This prop sets the color of the contained button's content (text, icons, etc.). It has no effect on outlined and text buttons.

7. **compact** (optional):
   - Type: boolean
   - Default: false
   - When set to `true`, it reduces the horizontal padding of the button. Useful for placing text buttons in a row.

8. **disableElevation** (optional):
   - Type: boolean
   - Default: false
   - When set to `true`, it removes the shadow from the button. However, it has no effect on outlined and text buttons.

9. **uppercase** (optional):
   - Type: boolean
   - Default: true
   - If set to `false`, it renders the button title in lowercase. This has no effect if you pass a React Node as the title prop.

10. **loading** (optional):
    - Type: boolean
    - Default: false
    - When set to `true`, it displays a loading indicator within the button.

11. **loadingIndicatorPosition** (optional):
    - Type: "leading" | "trailing" | "overlay"
    - Default: "leading"
    - Specifies where the loading indicator should appear: "leading" (before the title), "trailing" (after the title), or "overlay" (on top of the button).

12. **loadingIndicator** (optional):
    - Type: string | React.ReactNode | ((props: { color: string }) => React.ReactNode | null)
    - Allows you to provide a custom loading indicator. It can be a string (e.g., "Loading...") or a React element.
