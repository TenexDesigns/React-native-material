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

Here's an example of how you can use the `Badge` component with various props:

```jsx
import React from "react";
import { Badge, Stack } from "@react-native-material/core";

const App = () => (
  <Stack fill center spacing={4}>
    <Badge label={4} />
    <Badge label={23} />
    <Badge label={123} color="primary" />
    <Badge label="error" color="error" />
    <Badge label={0} showZero={true} />
    <Badge label={100} max={99} />
    <Badge
      label={(color) => (
        <Text style={{ color }}>Dynamic</Text>
      )}
      color="warning"
      tintColor="white"
    />
  </Stack>
);

export default App;
```

In this example:

- We use the `label` prop to specify the content of each badge.
- Some badges have predefined colors using the `color` prop.
- We demonstrate the `showZero` prop to display a badge even when the label is zero.
- The `max` prop truncates the label and adds a `+` sign if it exceeds the specified maximum value.
- The `label` prop can also accept a function that generates a dynamic React element based on the badge's color.

You can customize the appearance and behavior of badges in your app by adjusting these props according to your specific use case.
