expected = 'a {\n  color: #ff0000;\n}\np {\n  color: #ffff00;\n}\n\r\n'

css = new File(basedir, "target/test.css")
assert css.exists()
assert css.getText().equals(expected)