package qwikflix

class QuoteController {
	static defaultAction = "random"
	def quoteService
	
    def index() { 
		
	}
	
	def ajaxRandom() {
		def randomQuote = quoteService.getRandomQuote()
		render {
			q(randomQuote.content)
			p(randomQuote.author)
		} 
	}
	
	def random() {
		def randomQuote = quoteService.getRandomQuote()
		[quote : randomQuote]
	}
}
