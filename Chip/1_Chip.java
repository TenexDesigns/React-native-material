The Chip component from react-native-material is a component that can be used to display a chip. Chips are typically used to represent categories or to allow users to enter information, make selections, filter content, or trigger actions.

To use the Chip component, simply import it into your component and then add it to your render function. The Chip component has a few props that you can use to customize it, such as the label prop, the variant prop, and the color prop.

Here is an example of how to use the Chip component:

JavaScript
import React from "react";
import { Chip } from "@react-native-material/core";

const App = () => (
  <Chip label="Filled" />
);

export default App;
Use code with caution. Learn more
This code will render a chip with the text "Filled".

You can also use the Chip component to display a chip with an icon. For example, the following code will render a chip with a face icon:

JavaScript
import React from "react";
import { Chip, Icon } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <Chip
    label="Filled"
    color="primary"
    leading={props => <Icon name="face" {...props} />}
  />
);

export default App;
Use code with caution. Learn more
The Chip component can be used in a variety of ways. It is a good idea to use the Chip component whenever you want to represent a category or to allow users to enter information, make selections, filter content, or trigger actions.

Here is a summary of the props that you can use to customize the Chip component:

label: The text to display in the chip.
variant: The variant of the chip. Can be filled or outlined.
color: The color of the chip.
contentContainerStyle: The style of the chip's container.
labelStyle: The style of the chip's label.
leadingContainerStyle: The style of the chip's leading element.
trailingContainerStyle: The style of the chip's trailing element.
Here are some images of the different styles of chips:
Outlined chipOpens in a new window

www.vecteezy.com
Outlined chip

Here are some examples of how to use the different props of the Chip component:

JavaScript
// Render a chip with a custom color
<Chip label="Filled" color="red" />

// Render a chip with an icon
<Chip label="Filled" leading={<Icon name="face" />} />

// Render a chip with a custom content container style
<Chip label="Filled" contentContainerStyle={{ backgroundColor: "red" }} />

// Render a chip with a custom label style
<Chip label="Filled" labelStyle={{ color: "white" }} />
Use code with caution. Learn more
I hope this helps!





Props
---------------------------------------------------------------------------------------------------------------------




  Common Props:
label (required):
  This prop specifies the text to display inside the chip. It's a string or a React node. For example, <Chip label="Filled" />.

leading (optional):
  The leading prop allows you to place an element before the label. This can be used to add an icon or any other content before the text in the chip. It's a React node or a function that takes props and returns a React node. For example:

jsx
Copy code
<Chip
  label="Filled"
  leading={props => <Icon name="face" {...props} />}
/>
trailing (optional): Similar to the leading prop, the trailing prop allows you to place an element after the label. It can be used for icons, buttons, or any other content you want to display after the text in the chip. Like leading, it's a React node or a function that takes props and returns a React node.

Additional Props:
variant (optional): Determines the style variant of the chip. It can be either "filled" (default) for a filled chip with a solid background or "outlined" for a chip with a solid border and a transparent background.

color (optional): Specifies the color of the chip. You can use color values or color names like "primary", "secondary", etc., based on your theme setup.

contentContainerStyle (optional): This prop allows you to style the container that holds the chip's content. It accepts styles similar to the style prop in React Native components.

labelStyle (optional): You can use the labelStyle prop to style the chip's label text. It accepts styles similar to the style prop for text components.

leadingContainerStyle (optional): Style for the container holding the leading element.

trailingContainerStyle (optional): Style for the container holding the trailing element.


























  




  ..
