The syntax used to create the leading icons in the above example is:

```javascript
leading={props => (
  <IconButton icon={props => <Icon name="menu" {...props} />} {...props} />
)}
```

This is a function component that takes the `props` object as an argument and returns an `IconButton` component. The `IconButton` component is used to display a button with an icon. The `icon` prop to the `IconButton` component is a function that takes a `props` object as an argument and returns an icon. In this case, the `icon` function returns an `Icon` component from the `@expo/vector-icons` package.

The `{...props}` spread operator is used to pass all of the props that are passed to the leading function component to the `IconButton` component. This allows you to customize the `IconButton` component using the props that are passed to the leading function component.

For example, you could pass a `color` prop to the leading function component to specify the color of the icon. The `IconButton` component would then use this prop to set the color of the icon.

The `props` object represents all of the props that are passed to the leading function component. These props can be used to customize the leading icon.

In the above example, the leading icon is a menu button. The menu button is displayed on the left side of the toolbar. The menu button is used to open a navigation drawer.

I hope this helps!
