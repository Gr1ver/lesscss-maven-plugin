expected = '#header {\n  color: #4d926f;\n}\nh2 {\n  color: #4d926f;\n}\n\r\n'

css = new File(basedir, "target/webapp-testing/css/test.css")
assert css.exists()
assert css.getText().equals(expected)
