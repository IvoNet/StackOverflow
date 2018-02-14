    import csv
    import datetime
    # import statements
    from reportlab.lib.pagesizes import letter
    from reportlab.pdfgen import canvas

    now = datetime.datetime.now()

    # Function for importing data
    def import_data(pdf, data_file):
        textMessageinfo = csv.reader(open(data_file, "r"))
        for row in textMessageinfo:
            _id = row[0]
            incoming_number = row[1]
            date_and_time = row[2]
            read = row[3]
            sent_replied = row[4]
            body = row[5]
            seen = row[6]
            pdf_filename = _id + incoming_number + date_and_time + read + sent_replied + body + seen + '.pdf'
            generate_report(pdf, _id, incoming_number, date_and_time, read, sent_replied, body, seen, pdf_filename)


    def generate_report(pdf, _id, incoming_number, date_and_time, read, sent_replied, body, seen, pdf_filename):
        smsdata = "" + _id + incoming_number + date_and_time + read + sent_replied + body + seen
        pdf.drawString(50, 100, smsdata)
        pdf.showPage()


    def front_page():
        pdf = canvas.Canvas("SMS_Report.pdf", pagesize=letter)
        pdf.setLineWidth(.3)
        pdf.setFont('Helvetica', 12)
        pdf.drawString(30, 750, 'LYIT MOBILE FORENSICS DIVISION')
        pdf.drawString(500, 750, "Date: " + now.strftime("%d-%m-%y"))  # Prints date of the report(on the fly)
        pdf.line(500, 747, 595, 747)
        pdf.drawString(500, 725, 'Case Number:')
        pdf.drawString(580, 725, "10")
        pdf.line(500, 723, 595, 723)

        # Introduction text
        line1 = 'This forensic report on sms data has been compiled by the forensic'
        line2 = 'examiner in conclusion to the investigation into the RTA'
        line3 = 'case which occurred on the 23/01/2018.'
        textObject = pdf.beginText(30, 700)
        lines = [line1, line2, line3]
        for line in lines:
            textObject.textLine(line)

        pdf.drawText(textObject)
        return pdf


    def main():
        data_file = 'smsInfo.csv'
        pdf = front_page()
        import_data(pdf, data_file)
        pdf.save()
        print("Forensic Report Generated!")


    if __name__ == '__main__':
        main()

