# JHaml

A Java implementaion of [Haml](http://haml-lang.com/) (XHTML Abstraction Markup Language).

Haml features not currently supported:

* Interpolation. (Handled by Grails if rendering to GSP)

* Sass/SCSS. (Coming soon)

* Ugly mode for faster rendering speed. (Everything will be prerendered anyway)

* Support for bad syntax in attribute hash, e.g. %p{:foo => 'bar\"}

* Interpreting lists as attribute values, e.g. {:id => [:a, :b]} yields id='a_b'

* Whitespace removal with '<' and '>'

* Multiline with |

* Escaping of expressions with '!=' and '&=' 

* Attribute Methods

* Object References: []

* 'encoding' option

## Using

    String html = new JHaml().parse("some haml");

## Authors

JHaml was created by [Ray Myers](http://cadrlife.com), with very special thanks to the implementers of the 
original Haml for Ruby, [Hampton Catlin](http://hamptoncatlin.com) and [Nathan Weizenbaum](http://nex-3.com).

This implementation is licensed under the GNU GPL version 3.0 OR Apache 2.0 at your option. The libraries it depends on are licensed as follows.

Google Guava: Apache 2.0

Apache Commons Lang: Apache 2.0

markdownj: BSD
