The `ListItem` component in the `@react-native-material/core` library is used to create individual items within a list. It's a versatile component that can be customized to display various types of content within a list, including text, icons, avatars, and more. Let's break down the props and see how to use them:

**Props:**

1. `title` (string, optional): This prop specifies the primary text content of the list item. It represents the main title or label for the item.

2. `secondaryText` (string, optional): Use this prop to provide additional descriptive text or secondary information related to the list item.

3. `overline` (string, optional): The `overline` prop is used for a small amount of text that appears above the main title. It's typically used for metadata or a brief description.

4. `meta` (string, optional): Similar to the `overline`, the `meta` prop allows you to include a small amount of metadata or text below the main title.

5. `leadingMode` ("icon" | "avatar" | "image", optional): This prop specifies the type of leading content to be displayed before the title. It can be one of three options: "icon" (default), "avatar," or "image."

6. `leading` (React.ReactElement, optional): Use the `leading` prop to define the content that appears before the title. This can be an icon, an avatar, or an image, depending on the `leadingMode` you choose.

7. `trailing` (React.ReactElement | ((props: { color: string; size: number }) => React.ReactElement | null) | null, optional): The `trailing` prop allows you to specify content that appears after the title. It can be an icon, text, or any other React element. You can also pass a function that receives props for color and size.

Now, let's look at how to use the `ListItem` component with different configurations:

**Basic List:**

```jsx
import React from "react";
import { ListItem } from "@react-native-material/core";

const App = () => (
  <>
    <ListItem title="List Item" />
    <ListItem title="List Item" />
    <ListItem title="List Item" />
  </>
);

export default App;
```

**List with Icons:**

```jsx
import React from "react";
import { ListItem } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <>
    <ListItem
      title="Inbox"
      leading={<Icon name="inbox" size={24} />}
      trailing={props => <Icon name="chevron-right" {...props} />}
    />
    <ListItem
      title="Drafts"
      leading={<Icon name="email-open" size={24} />}
      trailing={props => <Icon name="chevron-right" {...props} />}
    />
    <ListItem
      title="Trash"
      trailing={props => <Icon name="chevron-right" {...props} />}
    />
    <ListItem
      title="Spam"
      trailing={props => <Icon name="chevron-right" {...props} />}
    />
  </>
);

export default App;
```

**List with Avatars:**

```jsx
import React from "react";
import { ListItem, Avatar } from "@react-native-material/core";

const App = () => (
  <>
    <ListItem
      leadingMode="avatar"
      leading={
        <Avatar image={{ uri: "https://mui.com/static/images/avatar/1.jpg" }} />
      }
      title="Brunch this weekend?"
      secondaryText="I'll be in your neighborhood doing errands this…"
    />
    <ListItem
      leadingMode="avatar"
      leading={
        <Avatar image={{ uri: "https://mui.com/static/images/avatar/2.jpg" }} />
      }
      title="Summer BBQ"
      secondaryText="Wish I could come, but I'm out of town this…"
    />
    <ListItem
      leadingMode="avatar"
      leading={
        <Avatar image={{ uri: "https://mui.com/static/images/avatar/3.jpg" }} />
      }
      title="Oui Oui"
      secondaryText="Do you have Paris recommendations? Have you ever…"
    />
  </>
);

export default App;
```

These examples demonstrate how to use the `ListItem` component to create lists with different types of content, including text, icons, and avatars. You can customize the appearance and structure of your lists by adjusting the props according to your design requirements.
