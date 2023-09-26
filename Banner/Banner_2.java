The `Banner` component in `@react-native-material/core` is used to display a prominent message with optional actions. It's typically used to show important, succinct messages to the user and provide them with actions they can take in response to the message. Here's an explanation of the `Banner` component's props and how to use it:

```jsx
import { Banner } from "@react-native-material/core";
```

### Props for the Banner Component:

1. **text** (Required):
   - Type: string | React.ReactElement | null
   - This prop is used to specify the main message or text to be displayed in the banner.

2. **illustration** (Optional):
   - Type: React.ReactElement | ((props: { size: number }) => React.ReactElement | null) | null
   - You can use this prop to provide an illustration or icon that accompanies the message. It can be a React element or a function that returns a React element.

3. **buttons** (Required):
   - Type: React.ReactElement | React.ReactElement[] | null
   - Use this prop to define action buttons associated with the banner. It can be a single React element or an array of elements. These buttons allow users to take actions related to the banner message.

4. **style** (Optional):
   - Type: StyleProp<ViewStyle>
   - You can apply custom styles to the banner component using this prop.

5. **contentContainerStyle** (Optional):
   - Type: StyleProp<ViewStyle>
   - This prop allows you to style the container that holds the banner's content (text, illustration, and buttons).

6. **illustrationContainerStyle** (Optional):
   - Type: StyleProp<ViewStyle>
   - If you're using an illustration, you can apply custom styles to the container that holds the illustration.

7. **textContainerStyle** (Optional):
   - Type: StyleProp<ViewStyle>
   - Use this prop to style the container that holds the text of the banner.

8. **textStyle** (Optional):
   - Type: StyleProp<TextStyle>
   - You can apply custom styles to the text displayed in the banner.

9. **actionsContainerStyle** (Optional):
   - Type: StyleProp<ViewStyle>
   - Style the container that holds the action buttons.

### Examples of Using the Banner Component:

Here are two examples of how to use the `Banner` component:

#### Example 1:

```jsx
import React from "react";
import { HStack, Banner, Button } from "@react-native-material/core";

const App = () => (
  <Banner
    text="There was a problem processing a transaction on your credit card."
    buttons={
      <HStack spacing={2}>
        <Button key="fix-it" variant="text" title="Fix it" compact />
        <Button key="learn-more" variant="text" title="Learn More" compact />
      </HStack>
    }
  />
);

export default App;
```

In this example, a simple `Banner` is displayed with text and action buttons wrapped in an `HStack` to control their layout.

#### Example 2:

```jsx
import React from "react";
import { HStack, Banner, Button, Avatar } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <Banner
    illustration={props => (
      <Avatar
        color="primary"
        icon={props => <Icon name="wifi-off" {...props} />}
        {...props}
      />
    )}
    text="There was a problem processing a transaction on your credit card."
    buttons={
      <HStack spacing={2}>
        <Button key="fix-it" variant="text" title="Fix it" compact />
        <Button key="learn-more" variant="text" title="Learn More" compact />
      </HStack>
    }
  />
);

export default App;
```

In this example, an `Avatar` illustration is used alongside the text in the `Banner`. The `Avatar` component displays a Wi-Fi off icon from the MaterialCommunityIcons library. This illustrates how you can customize the `illustration` prop to include icons or other React elements.

These examples demonstrate the basic usage of the `Banner` component with various customization options. You can further style and configure the `Banner` to match your app's design and messaging requirements.

