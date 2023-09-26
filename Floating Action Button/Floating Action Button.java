The Floating Action Button (FAB) component in the `@react-native-material` library is used to create a prominent and actionable button that typically represents the primary action on a screen. It's a circular button that can have different variants, sizes, colors, labels, and loading states. Below, I'll explain the props used in your provided code examples and what they do:

### Example 1:

```jsx
<FAB icon={props => <Icon name="plus" {...props} />} visible={visible} />
<FAB
  size="mini"
  icon={props => <Icon name="plus" {...props} />}
  visible={visible}
/>
<FAB
  variant="extended"
  icon={props => <Icon name="navigation" {...props} />}
  label="Navigate"
  color="primary"
  visible={visible}
/>
```

- `icon`: This prop allows you to specify the icon that appears on the FAB. You can provide a React element that renders an icon (in this case, you're using the `MaterialCommunityIcons` icon from `@expo/vector-icons`).

- `visible`: This prop controls the visibility of the FAB. It accepts a boolean value (`true` or `false`) and determines whether the FAB is visible or not based on the state stored in the `visible` variable in your state management logic (controlled by the `Switch` component).

- `size`: This prop specifies the size of the FAB and can be set to either `"default"` or `"mini"`.

- `variant`: This prop defines the FAB variant and can be set to `"standard"` (default) or `"extended"`. The "extended" variant includes a label next to the icon.

- `label`: This prop is used to provide a label for the FAB when the `"extended"` variant is used. It can be a string or a React element.

- `color`: This prop allows you to set the color of the FAB. You can use predefined color names like `"primary"` or specify a color code.

### Example 2:

```jsx
<FAB icon={props => <Icon name="lock" {...props} />} />
<FAB
  variant="extended"
  icon={props => <Icon name="lock" {...props} />}
  label="Button"
  tintColor="red"
/>
<FAB icon={props => <Icon name="lock" {...props} />} color="on-primary" />
<FAB icon={props => <Icon name="lock" {...props} />} color="#FDCAE4" />
<FAB
  icon={props => <Icon name="lock" {...props} />}
  color="#FDCAE4"
  tintColor="yellow"
/>
```

In this example, you're demonstrating different color-related props:

- `tintColor`: This prop allows you to set a custom tint color for the FAB icon when it's in its pressed/active state.

- `color`: This prop sets the background color of the FAB. You can use predefined color names or specify color codes.

### Example 3:

```jsx
<FAB icon={props => <Icon name="account" {...props} />} />
<FAB icon={props => <Icon name="account" {...props} />} size="mini" />
```

In this example, you're showcasing the `"mini"` size variant by setting the `size` prop to `"mini"`. This makes the FAB smaller compared to the default size.

### Example 4:

```jsx
<FAB variant="extended" label="Button" color="primary" />
<FAB
  variant="extended"
  icon={props => <Icon name="star" {...props} />}
  label="Button"
  color="primary"
/>
```

Here, you're demonstrating the `"extended"` variant of the FAB, which includes a label next to the icon. The label is set using the `label` prop, and the icon can also be customized.

### Example 5:

```jsx
<FAB icon={props => <Icon name="plus" {...props} />} />
<FAB
  icon={props => <Icon name="plus" {...props} />}
  color="primary"
  loading
/>
<FAB
  variant="extended"
  icon={props => <Icon name="navigation" {...props} />}
  label="navigate"
  color="primary"
/>
```

In this example, you're showcasing the use of the `loading` prop, which sets the FAB into a loading state. When the FAB is in this state, it displays a loading spinner. You can use this feature when you need to indicate that some background process is taking place in response to the FAB click.

These examples cover different use cases and configurations of the Floating Action Button component in the `@react-native-material` library. Depending on your app's requirements, you can customize the FAB's appearance and behavior using these props.
