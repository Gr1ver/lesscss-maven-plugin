expected = '#header {\n  color: #4d926f;\n}\nh2 {\n  color: #4d926f;\n}\n\r\n'

css = new File(basedir, "target/min-test-1.33.7.css")
assert css.exists()
assert css.getText().equals(expected)
