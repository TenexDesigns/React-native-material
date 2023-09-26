The `Button` component from the `@react-native-material/core` library allows you to create buttons in your React Native applications. Below, I'll explain the key props and how to use them:

1. **title**:
   - Type: string | React.ReactNode | ((props: { color: string }) => React.ReactNode | null)
   - This prop specifies the text content of the button. You can provide a string, a React element, or a function that returns a React element. It's the visible label on the button.

2. **leading** (optional):
   - Type: React.ReactNode | ((props: { color: string; size: number }) => React.ReactNode | null)
   - This prop allows you to place an element before the button's title. It can be a React element or a function returning a React element. This is useful for adding icons or other elements.

3. **trailing** (optional):
   - Type: React.ReactNode | ((props: { color: string; size: number }) => React.ReactNode | null)
   - Similar to `leading`, this prop allows you to place an element after the button's title.

4. **variant** (optional):
   - Type: "text" | "outlined" | "contained"
   - Default: "contained"
   - Specifies the style of the button. You can choose from "text" (low emphasis), "outlined" (medium emphasis), and "contained" (high emphasis).

5. **color** (optional):
   - Type: Color
   - Default: "primary"
   - Specifies the main color of the button. For "contained" buttons, this is the background color. For "outlined" and "text" buttons, this is the color of the content (text, icons, etc.).

6. **tintColor** (optional):
   - Type: Color
   - This prop sets the color of the contained button's content (text, icons, etc.). It has no effect on outlined and text buttons.

7. **compact** (optional):
   - Type: boolean
   - Default: false
   - When set to `true`, it reduces the horizontal padding of the button. Useful for placing text buttons in a row.

8. **disableElevation** (optional):
   - Type: boolean
   - Default: false
   - When set to `true`, it removes the shadow from the button. However, it has no effect on outlined and text buttons.

9. **uppercase** (optional):
   - Type: boolean
   - Default: true
   - If set to `false`, it renders the button title in lowercase. This has no effect if you pass a React Node as the title prop.

10. **loading** (optional):
    - Type: boolean
    - Default: false
    - When set to `true`, it displays a loading indicator within the button.

11. **loadingIndicatorPosition** (optional):
    - Type: "leading" | "trailing" | "overlay"
    - Default: "leading"
    - Specifies where the loading indicator should appear: "leading" (before the title), "trailing" (after the title), or "overlay" (on top of the button).

12. **loadingIndicator** (optional):
    - Type: string | React.ReactNode | ((props: { color: string }) => React.ReactNode | null)
    - Allows you to provide a custom loading indicator. It can be a string (e.g., "Loading...") or a React element.

Here are some code samples demonstrating the usage of the `Button` component:

```jsx
import React from "react";
import { Stack, Button } from "@react-native-material/core";

const App = () => (
  <Stack fill center spacing={4}>
    <Button title="Contained" />
    <Button variant="outlined" title="Outlined" />
    <Button variant="text" title="Text" />
  </Stack>
);

export default App;
```

```jsx
import React from "react";
import { Stack, Button } from "@react-native-material/core";

const App = () => (
  <Stack fill center spacing={4}>
    <Button variant="text" title="Button" color="secondary" />
    <Button title="Button" color="error" />
    <Button variant="outlined" title="Button" color="#d4ac2d" />
    <Button title="Button" color="pink" tintColor="red" />
  </Stack>
);

export default App;
```

```jsx
import React from "react";
import { Stack, Button } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <Stack fill center spacing={4}>
    <Button
      variant="outlined"
      title="Delete"
      leading={props => <Icon name="delete" {...props} />}
    />
    <Button title="Send" trailing={props => <Icon name="send" {...props} />} />
  </Stack>
);

export default App;
```

```jsx
import React from "react";
import { Stack, Button } from "@react-native-material/core";

const App = () => (
  <Stack fill center spacing={4}>
    <Button title="Button" />
    <Button title="Button" uppercase={false} />
  </Stack>
);

export default App;
```

```jsx
import React, { useState } from "react";
import { Stack, Button, Text, Switch } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => {
  const [loading, setLoading] = useState(true);
  return (
    <Stack fill center spacing={4}>
      <Switch value={loading} onValueChange={setLoading} />
      <Button
        title="Button"
        leading={props => <Icon name="plus" {...props} />}
        loading={loading}
        loadingIndicator="⏰"
      />
      <Button
        title="Custom Text"
        loading={loading}
        loadingIndicator="Loading..."
        loadingIndicatorPosition="overlay"
      />
      <Button
        title="Button"
        loading={loading}
        loadingIndicator={props => (
          <Text
            style={{
              backgroundColor: props.color,
              color: "black",
              borderRadius: 50,
              width: 24,
              height: 24,
              textAlign: "center",
            }}
          >
            ...
          </Text>
        )}
        loadingIndicatorPosition="overlay"
      />
      <Button
        title="Button"
        trailing={props => <Icon name="plus" {...props} />}
        loading={loading}
        loadingIndicator="⏰"
        loadingIndicatorPosition="trailing"
      />
    </Stack>
  );
};

export default App;
```

These code samples demonstrate various configurations of the `Button` component, including changing the button style, color, and adding custom loading indicators. You can mix and match these props to create buttons that fit your app's design and functionality.
