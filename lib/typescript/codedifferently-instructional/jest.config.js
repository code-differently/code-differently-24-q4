const esModules = ['bcrypt'].join('|');

/** @type {import('ts-jest').JestConfigWithTsJest} **/
export default {
  testEnvironment: "node",
  transform: {
    "^.+.tsx?$": ["ts-jest",{}],
  },
  "moduleNameMapper": {
    "^(\\.\\.?\\/.+)\\.js$": "$1",
  },
  transformIgnorePatterns: [`/node_modules/(?!${esModules})`],
};