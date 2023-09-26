

1
The Badge component from react-native-material is a component that can be used to display a badge on an element. Badges are typically used to indicate the status of an element, such as the number of unread messages in a mailbox or the number of items in a cart.

To use the Badge component, simply import it into your component and then add it to your render function. The Badge component has a few props that you can use to customize it, such as the label prop, the color prop, and the tintColor prop.

Here is an example of how to use the Badge component:

JavaScript
import React from "react";
import { Badge, Stack } from "@react-native-material/core";

const App = () => (
  <Stack fill center spacing={4}>
    <Badge label={4} />
    <Badge label={23} />
    <Badge label={123} color="primary" />
    <Badge label="error" color="error" />
  </Stack>
);

export default App;
Use code with caution. Learn more
This code will render four badges, each with a different label and color.

You can also use the Badge component to display a badge on an element other than a text element. For example, the following code will display a badge on an image:

JavaScript
import React from "react";
import { Badge, Image } from "@react-native-material/core";

const App = () => (
  <Badge label={4}>
    <Image source={{ uri: "https://example.com/image.png" }} />
  </Badge>
);

export default App;
Use code with caution. Learn more
The Badge component can be used in a variety of ways. It is a good idea to use the Badge component whenever you want to indicate the status of an element.

Here is a summary of the props that you can use to customize the Badge component:

    label: The text to display on the badge.
    showZero: Whether to display the badge even when the label is zero.
    max: The maximum number of digits to display on the badge.
    visible: Whether to display the badge.
    color: The color of the badge.
    tintColor: The color of the badge's text and icons.
    style: The style of the badge.
    labelStyle: The style of the badge's label.
    I hope this helps!





PROPS
------------------------------------------------------------------------------------------------------------------------------------------------------------


  The `Badge` component in the `@react-native-material/core` library is used to highlight an item's status for quick recognition. It's commonly used to display numerical counts or labels on icons or other UI elements to indicate notifications, messages, or the status of an item. Let's go through the available props and how to use them:

### Props:

1. **label** (required):
   - Type: `number | string | React.ReactElement | ((props: { color: string }) => React.ReactElement | null) | null`
   - This prop defines the content of the badge. It can be a number, string, or a React element. You can also provide a function that returns a React element based on the badge's color. This is the text or content that will be displayed inside the badge.

2. **showZero** (optional):
   - Type: `boolean`
   - Default: `false`
   - If set to `true`, the badge will be visible even when the `label` is `0`.

3. **max** (optional):
   - Type: `number`
   - This prop allows you to set a maximum value for the badge. If the `label` exceeds this value, it will be truncated and displayed with a `+` sign. For example, if `max` is set to `99`, and the `label` is `100`, the badge will display `99+`.

4. **visible** (optional):
   - Type: `boolean`
   - Default: `true`
   - You can control the visibility of the badge using this prop. Setting it to `false` will hide the badge.

5. **color** (optional):
   - Type: `Color`
   - This prop defines the background color of the badge. You can use predefined color values like `"primary"`, `"error"`, or any other color value that your app's theme supports.

6. **tintColor** (optional):
   - Type: `Color`
   - This prop defines the text color of the badge.

7. **style** (optional):
   - Type: `Animated.AnimatedProps<ViewProps>["style"]`
   - This prop allows you to apply custom styles to the badge container.

8. **labelStyle** (optional):
   - Type: `StyleProp<TextStyle>`
   - You can use this prop to apply custom styles to the text or content inside the badge.

### Example Usage:

