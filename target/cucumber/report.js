$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BgColorChange.feature");
formatter.feature({
  "line": 2,
  "name": "Background color change",
  "description": "",
  "id": "background-color-change",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "1 Sky Blue Background",
  "description": "",
  "id": "background-color-change;1-sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button As \"Set SkyBlue Background\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "BackgroundStepDefinitions.button_exists(String)"
});
formatter.result({
  "duration": 2232756800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 26
    }
  ],
  "location": "BackgroundStepDefinitions.i_click_on_the_button_As(String)"
});
formatter.result({
  "duration": 51478300,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepDefinitions.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 32407900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "2 White Background Change",
  "description": "",
  "id": "background-color-change;2-white-background-change",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "\"Set White Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the button As \"Set White Background\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 1
    }
  ],
  "location": "BackgroundStepDefinitions.button_exists(String)"
});
formatter.result({
  "duration": 1580537500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 26
    }
  ],
  "location": "BackgroundStepDefinitions.i_click_on_the_button_As(String)"
});
formatter.result({
  "duration": 55362599,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStepDefinitions.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 26312599,
  "status": "passed"
});
});