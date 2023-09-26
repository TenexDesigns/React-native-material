

1

2
The Banner component from react-native-material is a component that can be used to display a banner at the top of the screen. Banners are typically used to display important messages to the user, such as an error message or a success message.

To use the Banner component, simply import it into your component and then add it to your render function. The Banner component has a few props that you can use to customize it, such as the text prop, the illustration prop, and the buttons prop.

Here is an example of how to use the Banner component:

JavaScript
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
Use code with caution. Learn more
This code will render a banner at the top of the screen with the message "There was a problem processing a transaction on your credit card." and two buttons, "Fix it" and "Learn More".

You can also use the Banner component to display an illustration. For example, the following code will display a banner with a Wi-Fi off icon:

JavaScript
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
Use code with caution. Learn more
The Banner component can be used in a variety of ways. It is a good idea to use the Banner component whenever you want to display an important message to the user.

Here is a summary of the props that you can use to customize the Banner component:

text: The text to display on the banner.
illustration: An illustration to display on the banner.
buttons: A list of buttons to display on the banner.
style: The style of the banner.
contentContainerStyle: The style of the banner's content container.
illustrationContainerStyle: The style of the banner's illustration container.
textContainerStyle: The style of the banner's text container.
textStyle: The style of the banner's text.
actionsContainerStyle: The style of the banner's actions container.
I hope this helps!







---------------------------------------------------------------------------------------------------------------------------------------------------------------
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

