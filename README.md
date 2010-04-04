# JHaml

A Java implementaion of [Haml](http://haml-lang.com/) (XHTML Abstraction Markup Language). Work in progress.

Haml features not currently supported (many of which do not make sense when rendering JSPs):

* Interpolation.

* External languages like MarkDown and Sass.

* Ugly mode for faster rendering speed.

* Support for bad syntax in attribute hash, e.g. %p{:foo => 'bar\"}

* Interpreting lists as attribute values, e.g. {:id => [:a, :b]} yields id='a_b'

* Whitespace removal with '<' and '>'

* Multiline with |

* Escaping of expressions with '!=' and '&=' 

* HTML-style Attributes: ()

* Attribute Methods

* Object Reference: []

* HTML5 Data Attributes

* 'encoding' option

## Authors

JHaml was created by [Ray Myers](http://cadrlife.com), with very special thanks to the implementers of the 
original Haml, [Hampton Catlin](http://hamptoncatlin.com) and [Nathan Weizenbaum](http://nex-3.com).

This implementation is licensed under the GNU GPL version 3.0, with the exception of the included 
libraries, which are licensed as specified in their source folders.

Google Guava: Apache 2.0

Apache Commons Lang: Apache 2.0
