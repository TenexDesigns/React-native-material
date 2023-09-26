The AppBar component from react-native-material is a component that can be used to display a toolbar at the top or bottom of the screen. The AppBar component can be used to display the title of the current screen, navigation buttons, and other actions.

To use the AppBar component, simply import it into your component and then add it to your render function. The AppBar component has a few props that you can use to customize it, such as the title prop, the leading prop, and the trailing prop.

Here is an example of how to use the AppBar component:

JavaScript
import React from "react";
import { AppBar } from "@react-native-material/core";

const App = () => (
  <AppBar title="Screen title" />
);

export default App;
Use code with caution. Learn more
This code will render a toolbar at the top of the screen with the title "Screen title".

You can also use the AppBar component to display navigation buttons. For example, the following code will display a navigation button on the left side of the toolbar:

JavaScript
import React from "react";
import { AppBar, IconButton } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <AppBar
    title="Screen title"
    leading={props => (
      <IconButton icon={props => <Icon name="menu" {...props} />} {...props} />
    )}
  />
);

export default App;
                                                                   
Use code with caution. Learn more
You can also use the AppBar component to display other actions on the right side of the toolbar. For example, the following code will display a button and an avatar on the right side of the toolbar:

JavaScript
import React from "react";
import { AppBar, IconButton, Button, Avatar } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <AppBar
    title="Screen title"
    trailing={props => (
      <HStack>
        <IconButton
          icon={props => <Icon name="magnify" {...props} />}
          {...props}
        />
        <IconButton
          icon={props => <Icon name="dots-vertical" {...props} />}
          {...props}
        />
      </HStack>
    )}
  />
);

export default App;
Use code with caution. Learn more
The AppBar component is a versatile component that can be used in a variety of ways. It is a good idea to use the AppBar component whenever you want to display a toolbar at the top or bottom of the screen.

Here is a summary of the props that you can use to customize the AppBar component:

variant: Whether you want to place the AppBar at the top or the bottom of the screen.
title: The primary text to display in the AppBar.
subtitle: The secondary text to display in the AppBar.
centerTitle: Whether the title and subtitle should be centered.
leading: The element displayed before the title.
trailing: The element displayed after the title.
color: The fill color of the AppBar's background.
tintColor: The color of the AppBar's content (title, subtitle, icons, etc.).
transparent: Whether the AppBar's background is transparent.
enableColorOnDark: If true, the color prop will be applied in dark mode.
contentContainerStyle: The style of the content container view.
titleContentStyle: The style of the title and subtitle container view.
titleStyle: The style of the title text.
subtitleStyle: The style of the subtitle text.
leadingContainerStyle: The style of the leading element container view.
trailingContainerStyle: The style of the trailing element container view.

  
I hope this helps!







  ----------------------------------------------------------------------------------------------------------------------------------------------------



  variant (string, default: "top"): Determines whether the app bar should be placed at the top or bottom of the screen.

title (string | React.ReactNode | ((props: { color: string }) => React.ReactNode | null) | null): The primary text to display in the app bar as the title.

subtitle (string | React.ReactNode | ((props: { color: string }) => React.ReactNode | null) | null): The secondary text to display in the app bar as a subtitle.

centerTitle (boolean, default: false): Specifies whether the title and subtitle should be centered within the app bar.

leading (React.ReactNode | ((props: { color: string; size: number }) => React.ReactNode | null) | null): The element displayed before the title. It's often used for a leading icon or button.

trailing (React.ReactNode | ((props: { color: string; size: number }) => React.ReactNode | null) | null): The element displayed after the title. This can be used for action buttons or icons.

color (string, default: "primary"): The fill color of the app bar's background.

tintColor (string): The color of the app bar's content (title, subtitle, icons, etc.).

transparent (boolean, default: false): Specifies whether the app bar's background should be transparent.

enableColorOnDark (boolean, default: false): If true, the color prop will be applied in dark mode.

contentContainerStyle (StyleProp<ViewStyle>): The style of the content container view.

titleContentStyle (StyleProp<ViewStyle>): The style of the title and subtitle container view.

titleStyle (StyleProp<TextStyle>): The style of the title text.

subtitleStyle (StyleProp<TextStyle>): The style of the subtitle text.

leadingContainerStyle (StyleProp<ViewStyle>): The style of the leading element container view.

trailingContainerStyle (StyleProp<ViewStyle>): The style of the trailing element container view.









  
