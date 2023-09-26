The `IconButton` component from the `@react-native-material/core` library is used to create buttons with icons. It allows you to easily add icons to your user interface and customize their appearance. Let's go over the usage, props, and the examples you provided:

### Usage:

You can import the `IconButton` component from `@react-native-material/core` and use it within your React Native application.

### Props:

Here are the props that the `IconButton` component accepts:

1. **icon** (Type: `React.ReactNode | ((props: { color: string; size: number }) => React.ReactNode | null) | null`, Optional: Yes): This prop defines the element to render as the icon. You can pass either a React element (e.g., an `<Icon />` component) or a function that receives `props` and returns a React element. This provides flexibility in defining the icon you want to use.

2. **color** (Type: `Color`, Default: `"on-background"`, Optional: Yes): The color of the icon and the press effect. You can specify a color value (e.g., `"primary"`, `"red"`, `"blue"`, etc.) to customize the icon's color.

3. **contentContainerStyle** (Type: `PressableProps["style"]`, Optional: Yes): This prop allows you to define the style of the icon's container view. You can use it to apply additional styles to the button's container.

### Examples:

Let's break down the two examples you provided:

#### Example 1:

```jsx
import React from "react";
import { Stack, IconButton } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <Stack fill center spacing={4}>
    <IconButton icon={props => <Icon name="eye" {...props} />} />
    <IconButton icon={props => <Icon name="dots-vertical" {...props} />} />
    <IconButton icon={props => <Icon name="magnify" {...props} />} />
  </Stack>
);

export default App;
```

In this example, you're importing the `IconButton` component and using it within a `Stack` component. You're creating three `IconButton` instances, each with a different icon (eye, dots-vertical, magnify) from the MaterialCommunityIcons set.

#### Example 2:

```jsx
import React from "react";
import { Stack, IconButton } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <Stack fill center spacing={4}>
    <IconButton icon={props => <Icon name="wifi" {...props} />} />
    <IconButton
      icon={props => <Icon name="account" {...props} />}
      color="primary"
    />
    <IconButton
      icon={props => <Icon name="magnify" {...props} />}
      color="red"
    />
  </Stack>
);

export default App;
```

In this example, you're again using the `IconButton` component within a `Stack`. You're creating three `IconButton` instances. The first one uses the "wifi" icon, the second one sets the color to "primary," and the third one sets the color to "red."

These examples demonstrate how to use the `IconButton` component to create buttons with icons, customize their colors, and integrate them into your UI using the `@react-native-material/core` library.


