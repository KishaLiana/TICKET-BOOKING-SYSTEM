const { override, fixBabelImports, addWebpackAlias } = require('customize-cra');
const path = require('path');
const resolve = dir => path.join(__dirname, dir);

module.exports = override(
  //Antd load on demand
  fixBabelImports('import', {
    libraryName: 'antd',
    libraryDirectory: 'es',
    style: 'css',
  }),
  //Configure path alias
  addWebpackAlias({
    '@': resolve('src'),
  }),
  //Close the production environment to generate a map file
  config => {
    if (process.env.NODE_ENV === 'production') {
      config.devtool = false;
    }
    return config;
  },
);

// const { injectBabelPlugin } = require('react-app-rewired');
// const rewireLess = require('react-app-rewire-less');

// module.exports = function override(config, env) {
//     config = injectBabelPlugin(['import', { libraryName: 'antd', style: true }], config);
//     config = rewireLess.withLoaderOptions({
//       modifyVars: {
//           "@layout-body-background": "#FFFFFF",
//           "@layout-header-background": "#FFFFFF",
//           "@layout-footer-background": "#FFFFFF"
//       },
//       javascriptEnabled: true
//     })(config, env);
//     return config;
// };

