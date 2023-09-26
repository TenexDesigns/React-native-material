Am learning react-native-material, Help me understandd the Text component, how and where to use it, it props and what they do and what it entails,,"Text
Use text to present your design and content as clearly and efficiently as possible.


Too many type sizes and styles at once can spoil any layout. A typographic scale has a limited set of type sizes that work well together along with the layout grid.

💬 Feedback 🎨 Material Design

Import
import { Text } from "@react-native-material/core";
Usage

Props
variant

The variant of the text.

Type: TypographyVariant;

Default: "body1"

Optional: Yes

color

The color of the text.

Type: Color;

Default: "on-background"

Optional: Yes",  "import React from "react";
import { Text, Stack } from "@react-native-material/core";

const App = () => (
  <Stack m={4} spacing={4}>
    <Text variant="h1">h1. Heading</Text>
    <Text variant="h2">h2. Heading</Text>
    <Text variant="h3">h3. Heading</Text>
    <Text variant="h4">h4. Heading</Text>
    <Text variant="h5">h5. Heading</Text>
    <Text variant="h6">h6. Heading</Text>
    <Text variant="subtitle1">
      subtitle1. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos
      blanditiis tenetur
    </Text>
    <Text variant="subtitle2">
      subtitle2. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos
      blanditiis tenetur
    </Text>
    <Text variant="body1">
      body1. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos
      blanditiis tenetur unde suscipit, quam beatae rerum inventore consectetur,
      neque doloribus, cupiditate numquam dignissimos laborum fugiat deleniti?
      Eum quasi quidem quibusdam.
    </Text>
    <Text variant="body2">
      body2. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quos
      blanditiis tenetur unde suscipit, quam beatae rerum inventore consectetur,
      neque doloribus, cupiditate numquam dignissimos laborum fugiat deleniti?
      Eum quasi quidem quibusdam.
    </Text>
    <Text variant="button">BUTTON TEXT</Text>
    <Text variant="caption">caption text</Text>
    <Text variant="overline">overline text</Text>
  </Stack>
);

export default App;"
