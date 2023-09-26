The `TextInput` component in `@react-native-material/core` is used to create text input fields in your React Native application. Text inputs are commonly used for user input, such as entering text in forms or dialogs. `@react-native-material/core` provides three variants of the `TextInput` component: "Filled," "Outlined," and "Standard," each with different visual styles. Let's break down the usage and props for this component:

### Basic Usage:
Here are three basic examples of how to use the `TextInput` component with different variants:

1. **Filled Variant:**
```jsx
import React from "react";
import { TextInput } from "@react-native-material/core";

const App = () => <TextInput label="Label" style={{ margin: 16 }} />;

export default App;
```

2. **Outlined Variant:**
```jsx
import React from "react";
import { TextInput } from "@react-native-material/core";

const App = () => (
  <TextInput variant="outlined" label="Label" style={{ margin: 16 }} />
);

export default App;
```

3. **Standard Variant:**
```jsx
import React from "react";
import { TextInput } from "@react-native-material/core";

const App = () => (
  <TextInput variant="standard" label="Label" style={{ margin: 16 }} />
);

export default App;
```

### Props:
Now, let's explore the props available for the `TextInput` component and what they do:

1. **variant (optional):** Specifies the variant of the text input. It can be one of `"filled"`, `"outlined"`, or `"standard"`. This prop determines the visual style of the input.

2. **label (optional):** The label to display above the text input. This label describes the purpose of the input field.

3. **leading (optional):** An element placed before the text input. It can be a React Node or a function returning a React Node. For example, you can use it to add icons or other elements before the input field.

4. **trailing (optional):** An element placed after the text input, similar to the `leading` prop. You can use it to add elements after the input field.

5. **color (optional):** The color of the text input's content, including the label, icons, and selection. The default value is `"primary"`, but you can customize it as needed.

6. **helperText (optional):** Helper text to display below the input field. It can provide additional information or guidance to the user.

7. **onMouseEnter (optional):** A callback function to call when the user moves the pointer over the input. Useful for handling hover events.

8. **onMouseLeave (optional):** A callback function to call when the user moves the pointer away from the input. Useful for handling hover events.

9. **style (optional):** The style of the container view for the entire text input component.

10. **inputContainerStyle (optional):** The style of the text input's container view, which includes the input field and the label.

11. **inputStyle (optional):** The style of the text input itself. You can use this to customize the appearance of the input field.

12. **leadingContainerStyle (optional):** The style of the container for the leading element (before the input).

13. **trailingContainerStyle (optional):** The style of the container for the trailing element (after the input).

These props allow you to customize the appearance and behavior of the `TextInput` component according to your application's requirements. You can choose the variant that suits your design, provide labels and helper text for clarity, and style the input and its elements as needed.

Remember to refer to the library's documentation for any updates or additional features, as libraries may evolve over time.
