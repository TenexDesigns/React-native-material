

1

1

1
The ListItem component from react-native-material is a component that can be used to display a list item. List items are typically used to display a single piece of information, such as a contact name or a product item.

To use the ListItem component, simply import it into your component and then add it to your render function. The ListItem component has a few props that you can use to customize it, such as the title prop, the secondaryText prop, the leading prop, and the trailing prop.

The title prop is the primary text of the list item. The secondaryText prop is the secondary text of the list item. The leading prop is the element that is displayed to the left of the title text. The trailing prop is the element that is displayed to the right of the title text.

Here is an example of how to use the ListItem component:

JavaScript
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
Use code with caution. Learn more
This code will render three list items with the text "List Item".

You can also use the ListItem component to display a list item with a leading or trailing icon. For example, the following code will render a list item with an inbox icon on the left and a chevron icon on the right:

JavaScript
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
  </>
);

export default App;
Use code with caution. Learn more
You can also use the ListItem component to display a list item with an avatar. For example, the following code will render a list item with an avatar on the left and the text "Brunch this weekend?" on the right:

JavaScript
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
    />
  </>
);

export default App;
Use code with caution. Learn more
The ListItem component can be used in a variety of ways. It is a good idea to use the ListItem component whenever you want to display a single piece of information in a list.

Here are some examples of how to use the ListItem component:

Display a list of contacts
Display a list of products
Display a list of tasks
Display a list of notifications
Display a list of settings
I hope this helps!
