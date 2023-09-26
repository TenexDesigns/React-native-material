The `Switch` component in `react-native-material` is used to create a toggle switch, allowing users to switch a single item on or off. It's commonly used for settings or options where a binary choice needs to be made. Here's an explanation of its key props and how to use it:

### Props:

1. **value** (boolean, required): This prop controls the state of the switch. When `value` is `true`, the switch is in the "on" position, and when `value` is `false`, it's in the "off" position.

2. **onValueChange** (function, required): This prop is a callback function that gets called when the user toggles the switch. It typically updates the `value` prop to reflect the new state of the switch. It receives the new value as an argument.

3. **disabled** (boolean, optional): When set to `true`, the switch is disabled and cannot be interacted with. It is typically used to indicate that a setting or option is unavailable.

### Usage:

Here's an example of how to use the `Switch` component in a React Native application:

```jsx
import React, { useState } from "react";
import { Stack, Switch } from "@react-native-material/core";

const App = () => {
  const [checked, setChecked] = useState(true);

  return (
    <Stack fill center spacing={4}>
      <Switch value={checked} onValueChange={() => setChecked(!checked)} />
      <Switch disabled />
    </Stack>
  );
};

export default App;
```

In this example, we have a simple React Native component. We use the `useState` hook to manage the state of the switch. The `value` prop of the first switch is controlled by the `checked` state, and the `onValueChange` prop toggles the `checked` state when the switch is pressed. The second switch is disabled and cannot be interacted with.

In a more complex scenario, you might use switches within a `ListItem` to represent options or settings that users can toggle within a list:

```jsx
import React, { useState } from "react";
import { ListItem, Switch } from "@react-native-material/core";

const App = () => {
  const [checked, setChecked] = useState(true);

  return (
    <>
      <ListItem
        title="List Item"
        trailing={
          <Switch value={checked} onValueChange={() => setChecked(!checked)} />
        }
        onPress={() => setChecked(!checked)}
      />
    </>
  );
};

export default App;
```

In this example, we use a `ListItem` with a switch to create a list item with a toggleable switch. When the user presses the list item or interacts with the switch, it toggles the `checked` state, updating the switch's appearance.

This is a basic overview of how to use the `Switch` component in `react-native-material`. You can further customize its appearance and behavior to suit your application's needs.





...
