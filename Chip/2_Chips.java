The `Chip` component in the `@react-native-material/core` library is used to represent a small block of information, typically used to categorize or display tags. Chips are interactive elements that can be used for various purposes, such as filtering content, making selections, or triggering actions. Let's break down the `Chip` component and its props:

#### Common Props:

1. **`label` (required):** This prop specifies the text to display inside the chip. It's a string or a React node. For example, `<Chip label="Filled" />`.

2. **`leading` (optional):** The `leading` prop allows you to place an element before the label. This can be used to add an icon or any other content before the text in the chip. It's a React node or a function that takes `props` and returns a React node. For example:
   
   ```jsx
   <Chip
     label="Filled"
     leading={props => <Icon name="face" {...props} />}
   />
   ```

3. **`trailing` (optional):** Similar to the `leading` prop, the `trailing` prop allows you to place an element after the label. It can be used for icons, buttons, or any other content you want to display after the text in the chip. Like `leading`, it's a React node or a function that takes `props` and returns a React node.

#### Additional Props:

4. **`variant` (optional):** Determines the style variant of the chip. It can be either `"filled"` (default) for a filled chip with a solid background or `"outlined"` for a chip with a solid border and a transparent background.

5. **`color` (optional):** Specifies the color of the chip. You can use color values or color names like `"primary"`, `"secondary"`, etc., based on your theme setup.

6. **`contentContainerStyle` (optional):** This prop allows you to style the container that holds the chip's content. It accepts styles similar to the `style` prop in React Native components.

7. **`labelStyle` (optional):** You can use the `labelStyle` prop to style the chip's label text. It accepts styles similar to the `style` prop for text components.

8. **`leadingContainerStyle` (optional):** Style for the container holding the `leading` element.

9. **`trailingContainerStyle` (optional):** Style for the container holding the `trailing` element.

Here are your code examples demonstrating the usage of the `Chip` component:

Example 1:
```jsx
import React from "react";
import { Stack, Chip } from "@react-native-material/core";

const App = () => (
  <Stack fill center spacing={4}>
    <Chip label="Filled" />
    <Chip variant="outlined" label="Outlined" />
  </Stack>
);

export default App;
```

In this example, two chips are created. One with the default "filled" variant and another with the "outlined" variant.

Example 2:
```jsx
import React from "react";
import { Stack, Chip } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <Stack fill center spacing={4}>
    <Chip
      label="Filled"
      color="primary"
      leading={props => <Icon name="face" {...props} />}
    />
    <Chip
      variant="outlined"
      label="Outlined"
      color="primary"
      leading={props => <Icon name="face" {...props} />}
    />
  </Stack>
);

export default App;
```

In this example, two chips are created with icons (`leading`) and customized colors (`color`) in addition to using the "outlined" variant for the second chip.

You can customize the `Chip` component to fit your specific design and functionality requirements, including styling, icons, and behavior.
